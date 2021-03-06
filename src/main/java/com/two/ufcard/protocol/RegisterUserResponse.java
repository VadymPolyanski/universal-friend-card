package com.two.ufcard.protocol;

import com.two.ufcard.protocol.api.Response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterUserResponse extends Response {
    private String token;
    private String type;
    private Integer expiresIn;
    private String refresh;
}
