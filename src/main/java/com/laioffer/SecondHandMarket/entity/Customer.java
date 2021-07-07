package com.laioffer.SecondHandMarket.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="customer")
public class Customer implements Serializable {
    private static final long serialVersionUID = 2652327633296064143L;
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    @OneToOne /*Used to define the one-to-one mapping between two entity classes.*/
    @JoinColumn /*在customer中创建一个foreign key名字叫saleListId， mapping到saleList的primary key*/
    private SaleList saleList;

    @OneToOne
    private Avatar avatar;

}
