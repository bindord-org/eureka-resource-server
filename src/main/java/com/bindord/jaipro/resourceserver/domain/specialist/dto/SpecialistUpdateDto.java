package com.bindord.jaipro.resourceserver.domain.specialist.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.UUID;

@Setter
@Getter
public class SpecialistUpdateDto {

    private UUID id;

    @NotBlank
    @Size(min = 2, max = 36)
    private String name;

    @NotBlank
    @Size(min = 2, max = 36)
    private String lastName;

    @NotBlank
    @Size(min = 2, max = Byte.MAX_VALUE)
    private String address;

    @NotBlank
    @Size(min = 9, max = 15)
    private String phone;

    @Schema(example = "1")
    private Integer districtId;

}
