package com.vanbritt.groupmanagement.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;


@Entity
//@DiscriminatorValue("PROF")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Teacher extends Person{
    //are we adding student id or not
    private BigDecimal salary;
}
