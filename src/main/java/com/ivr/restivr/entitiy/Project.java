package com.ivr.restivr.entitiy;


import lombok.*;

import javax.persistence.*;

/**
 * Created by temelt on 3.02.2019.
 */
@Entity
@Table(name = "project", schema = "XYZ")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Project extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "project_name", length = 300)
    private String projectName;

    @Column(name = "project_code", length = 30)
    private String projectCode;

}
