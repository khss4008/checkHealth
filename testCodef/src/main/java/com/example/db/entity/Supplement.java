package com.example.db.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "supplement")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Supplement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplementId;

    @Column(name = "supplement_name")
    private String supplementName;

    @Column
    private Double price;

    @Column
    private String brand;

    @Column
    private String image;

    @Column
    private String ingredients;

    @Column
    private Integer bioavailability;

    @Column
    private Integer laxative;

    @Column(name = "kidney_disease")
    private Integer kidneyDisease;

    @Column(name = "consumer_lab_score")
    private Integer consumerLabScore;

    @Column(name = "additional_efficacy")
    private String additionalEfficacy;

    @Column
    private String note;

    @Column
    private Float amount;

    @Column(name = "required_count")
    private Float requiredCount;

    @Column
    private String formula;

    @Column
    private Integer views;

    @Column(name = "sustained_release")
    private Boolean sustainedRelease;

    @Builder
    public Supplement(Long supplementId, String supplementName, Double price, String brand, String image, String ingredients, Integer bioavailability, Integer laxative, Integer kidneyDisease, Integer consumerLabScore, String additionalEfficacy, String note, Float amount, Float requiredCount, String formula, Integer views, Boolean sustainedRelease) {
        this.supplementId = supplementId;
        this.supplementName = supplementName;
        this.price = price;
        this.brand = brand;
        this.image = image;
        this.ingredients = ingredients;
        this.bioavailability = bioavailability;
        this.laxative = laxative;
        this.kidneyDisease = kidneyDisease;
        this.consumerLabScore = consumerLabScore;
        this.additionalEfficacy = additionalEfficacy;
        this.note = note;
        this.amount = amount;
        this.requiredCount = requiredCount;
        this.formula = formula;
        this.views = views;
        this.sustainedRelease = sustainedRelease;
    }
}
