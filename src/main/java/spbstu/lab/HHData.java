package spbstu.lab;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class HHData implements Serializable {
    @JsonProperty("review_id")
    private final String review_id;
    @JsonProperty("city")
    private final String city;
    @JsonProperty("position")
    private final String position;
    @JsonProperty("positive")
    private final String positive;
    @JsonProperty("negative")
    private final String negative;
    @JsonProperty("salary_rating")
    private final String salary_rating;
    @JsonProperty("team_rating")
    private final String team_rating;
    @JsonProperty("managment_rating")
    private final String managment_rating;
    @JsonProperty("career_rating")
    private final String career_rating;
    @JsonProperty("workplace_rating")
    private final String workplace_rating;
    @JsonProperty("rest_recovery_rating")
    private final String rest_recovery_rating;
    @JsonProperty("target")
    private final String target;

    public HHData(@JsonProperty("review_id") String review_id,
                  @JsonProperty("city") String city,
                  @JsonProperty("position") String position,
                  @JsonProperty("positive") String positive,
                  @JsonProperty("negative")  String negative,
                  @JsonProperty("salary_rating") String salary_rating,
                  @JsonProperty("team_rating") String team_rating,
                  @JsonProperty("managment_rating") String managment_rating,
                  @JsonProperty("career_rating") String career_rating,
                  @JsonProperty("workplace_rating") String workplace_rating,
                  @JsonProperty("rest_recovery_rating") String rest_recovery_rating,
                  @JsonProperty("target") String target) {
        this.review_id = review_id;
        this.city = city;
        this.position = position;
        this.positive = positive;
        this.negative = negative;
        this.salary_rating = salary_rating;
        this.team_rating = team_rating;
        this.managment_rating = managment_rating;
        this.career_rating = career_rating;
        this.workplace_rating = workplace_rating;
        this.rest_recovery_rating = rest_recovery_rating;
        this.target = target;
    }

    @Override
    public String toString() {
        return "HHData{" +
            "reviewId=" + review_id +
            ", city='" + city + '\'' +
            ", position='" + position + '\'' +
            ", positive='" + positive + '\'' +
            ", negative='" + negative + '\'' +
            ", salaryRating=" + salary_rating +
            ", teamRating=" + team_rating +
            ", managementRating=" + managment_rating +
            ", careerRating=" + career_rating +
            ", workplaceRating=" + workplace_rating +
            ", restRecoveryRating=" + rest_recovery_rating +
            ", target=" + target +
            '}';
    }

    public String getReviewId() {
        return review_id;
    }

    public String getCity() {
        return city;
    }

    public String getPosition() {
        return position;
    }

    public String getPositive() {
        return positive;
    }

    public String getNegative() {
        return negative;
    }

    public String getSalaryRating() {
        return salary_rating;
    }

    public String getTeamRating() {
        return team_rating;
    }

    public String getManagementRating() {
        return managment_rating;
    }

    public String getCareerRating() {
        return career_rating;
    }

    public String getWorkplaceRating() {
        return workplace_rating;
    }

    public String getRestRecoveryRating() {
        return rest_recovery_rating;
    }

    public String getTarget() {
        return target;
    }
}
