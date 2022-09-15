package entityYapimiz;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;


@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)


public class BaseEntity {

    @Id
    @Column(name="id" ,nullable = false)  //database de adı ne olacak ve boş geçilemez
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //auto increament
    private Long id;


    @Column(name = "created_By")  //db de nasıl oluşturulacak onun bilgisini üstteki gibi tekrar verdik
    @CreatedBy
    private String  createdBy;

    @Column(name = "created_Date")
    @CreatedDate
    private Date createdDate;


    @Column(name = "updated_By")
    @LastModifiedBy
    private String updatedBy;

    @Column(name = "updated_Date")
    @LastModifiedDate
    private Date updatedDate;


    @Column(name = "system_auto_date")
    @Temporal(TemporalType.TIMESTAMP)  //bu yıl ay gün dk vs diye ekler
    @CreationTimestamp
    private Date date;


}
