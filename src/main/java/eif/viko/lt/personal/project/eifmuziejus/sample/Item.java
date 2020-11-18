package eif.viko.lt.personal.project.eifmuziejus.sample;

public class Item {
  private String audio;
  private String description;
  private String model;
  private String poster;
  private String title;

  public Item() { }

  public Item(String audio, String description, String model, String poster, String title) {
    this.audio = audio;
    this.description = description;
    this.model = model;
    this.poster = poster;
    this.title = title;
  }

  public String getAudio() {
    return audio;
  }

  public String getDescription() {
    return description;
  }

  public String getModel() {
    return model;
  }

  public String getPoster() {
    return poster;
  }

  public String getTitle() {
    return title;
  }
}
