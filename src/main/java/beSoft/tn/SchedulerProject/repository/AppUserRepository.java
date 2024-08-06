package beSoft.tn.SchedulerProject.repository;

import beSoft.tn.SchedulerProject.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Integer> {
}
