package beSoft.tn.SchedulerProject.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;


//@Getter
//@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AppUserDto{
    private Integer id;
    private String fullName;
    private String email;
    private String role;
    private String password;
    private List<RecentDto> recents;
    private List<AppUserProjectDto> appUserProjects;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<RecentDto> getRecents() {
        return recents;
    }

    public void setRecents(List<RecentDto> recents) {
        this.recents = recents;
    }

    public List<AppUserProjectDto> getAppUserProjects() {
        return appUserProjects;
    }

    public void setAppUserProjects(List<AppUserProjectDto> appUserProjects) {
        this.appUserProjects = appUserProjects;
    }
}
