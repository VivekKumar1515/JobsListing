package org.example.jobslisting.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "JobsPosting")
public class Post {
    private String description;
    private String experience;
    private String profile;
    private String[] technologies;


    public Post() {}

    public String[] getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String[] tech) {
        this.technologies = tech;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Post{" +
                "description='" + description + '\'' +
                ", experience='" + experience + '\'' +
                ", profile='" + profile + '\'' +
                ", technologies=" + Arrays.toString(technologies) +
                '}';
    }
}
