package main.java.com.thomasbrasil.repository;

@Repository
public interface VmsRepository extends JpaRepository<Vms, Long> {
    @Query("SELECT v FROM Vms v WHERE v.name = :name")
    List<Vms> findByName(@Param("name") String name);

    @Query("SELECT v FROM Vms v WHERE v.status = :status")
    List<Vms> findByStatus(@Param("status") String status);

    @Query("SELECT v FROM Vms v WHERE v.type = :type")
    List<Vms> findByType(@Param("type") String type);

    @Query("SELECT v FROM Vms v WHERE v.location = :location")
    List<Vms> findByLocation(@Param("location") String location);
}
