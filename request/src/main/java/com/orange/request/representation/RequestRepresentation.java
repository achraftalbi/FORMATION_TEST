package com.orange.request.representation;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestRepresentation {
    long number;
    String type;
    String status;
    String description;
}
