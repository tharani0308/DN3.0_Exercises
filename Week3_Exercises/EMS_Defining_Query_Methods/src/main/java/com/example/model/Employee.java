import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
    @NamedQuery(name = "Employee.findByDepartment", query = "SELECT e FROM Employee e WHERE e.department = :department")
})
public class Employee {
    // existing code
}
