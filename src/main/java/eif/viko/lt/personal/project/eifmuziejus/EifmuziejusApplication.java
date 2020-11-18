package eif.viko.lt.personal.project.eifmuziejus;

import com.google.gson.Gson;
import eif.viko.lt.personal.project.eifmuziejus.entity.Gadget;
import eif.viko.lt.personal.project.eifmuziejus.repository.GadgetRepository;
import eif.viko.lt.personal.project.eifmuziejus.sample.Item;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class EifmuziejusApplication {

    public static void main(String[] args) {
    SpringApplication.run(EifmuziejusApplication.class, args);
  }

//  @Bean
//  public CommandLineRunner demoData(GadgetRepository repo) {
//    return args -> {
//
//
//      String url = "https://muziejus-api.firebaseio.com/lt.json";
//
//      try(InputStream is = new URL(url).openStream();
//          Reader reader = new InputStreamReader(is, StandardCharsets.UTF_8)) {
//
//        Gson gson = new Gson();
//        Item[] data = gson.fromJson(reader, Item[].class);
//
//        List<Item> db = new ArrayList<>(Arrays.asList(data));
//
//        long index = 0;
//        for (Item item : db) {
//          index++;
//          repo.save(new Gadget(
//              index,
//              item.getTitle(),
//              item.getDescription(),
//              item.getPoster(),
//              item.getAudio(),
//              item.getModel(),
//              (new Random().nextDouble() * 50 + 20)
//          ));
//        }
//      }
//
//    };
//  }


}
