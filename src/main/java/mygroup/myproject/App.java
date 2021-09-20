package mygroup.myproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import mygroup.myproject.model.Address;
import mygroup.myproject.model.Cars;
import mygroup.myproject.model.Person;

public class App 
{
    public static void main( String[] args ) throws JsonParseException, JsonMappingException, IOException
    {
    	
    		ObjectMapper mapper = new XmlMapper();
    		InputStream inputStream = new FileInputStream(new File("persons.xml"));
    		TypeReference<List<Person>> typeReference = new TypeReference<List<Person>>() {};
    		List<Person> persons = mapper.readValue(inputStream, typeReference);
    		for(Person p :persons) {
    			System.out.println("My name is "+p.getFirstName()+" , I'm from " +p.getAddress().getCity()+
    					" first car was "+p.getCars().getFirstcar()+" ,  I am "+p.getAge() +" years old ");
    		}
    		Person person = new Person();
            person.setFirstName("Sri");
            person.setLastName("Vadamodulu");
            person.setAge(24);
            person.setAddress(new Address("Gandhi Street","Vizag","53017"));
            person.setCars(new Cars("Toyota","Honda"));
            
            mapper.writeValue(new File("personsOut.xml"), person);
            inputStream.close();
    	
    }
}
