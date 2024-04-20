package demo.hmvc.base.modules.demo.service;




import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import demo.hmvc.base.modules.demo.entity.DemoEtity;



@Repository("DemoModelRepository")
public interface DemoModelRepository extends JpaRepository<DemoEtity, Serializable>{

	
    
}
