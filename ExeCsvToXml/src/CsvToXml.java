import java.util.*;
import javax.xml.stream.*;
import javax.xml.stream.events.*;
import java.io.*;

public class CsvToXml {

	public static void main(String[] args) throws IOException, XMLStreamException, FactoryConfigurationError {

		Scanner input = new Scanner(System.in);
		System.out.println("Arquivo csv:\n");
		String arquivoCSV = input.next();
		
		BufferedReader br = new BufferedReader(new FileReader(arquivoCSV));
		XMLEventWriter writer = XMLOutputFactory.newInstance().createXMLEventWriter(System.out);
		XMLEventFactory fabricaEvento = XMLEventFactory.newFactory();

		String linha = "";
		String separador = ";";
		while ((linha = br.readLine()) != null) {
			String[] line = linha.split(separador);
			XMLEvent evento = fabricaEvento.createCharacters(line.toString());
		    writer.add(evento);
		}
		br.close();
	}

}
