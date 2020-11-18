package eif.viko.lt.personal.project.eifmuziejus.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Gadget {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 1024)
  private String title;
  @Column(length = 1024)
  private String description;
  @Column(length = 1024)
  private String imageURL;
  @Column(length = 1024)
  private String soundURL;
  @Column(length = 1024)
  private String model3dURL;
  private double price;

}
