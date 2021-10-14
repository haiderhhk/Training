package data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Department;
@Repository("departmentDao")
public class DepartmentDao {
	@Autowired
	SessionFactory sessionFactory;
	Transaction tx=null;
	public boolean addDepartment(Department dept){
		System.out.println("Adding dept (in DepartmentDao)");
		Session session=null;
		try{
		session=sessionFactory.openSession();
		tx=session.beginTransaction();
		session.save(dept);
		tx.commit();
		System.out.println("Commit");
		return true;
		}catch(Exception e){
			System.out.println("Rollback");
			tx.rollback();
			return false;
		}
		finally{
			if(session!=null)
				session.close();
		}
	}//add Dept close
}
