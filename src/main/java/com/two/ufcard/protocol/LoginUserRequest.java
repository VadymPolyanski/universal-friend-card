package com.two.ufcard.protocol;

import com.two.ufcard.protocol.api.Request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginUserRequest extends Request {
    private String login;
    private String password;
}
