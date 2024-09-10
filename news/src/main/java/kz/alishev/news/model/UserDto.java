package kz.alishev.news.model;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class UserDto {
    @Size(min = 12, max = 12, message = "ИИН должен содержать 12 символов")
    @NotBlank(message = "ИИН не должен быть пустым")
    private String iin;
    @Size(min = 3, message = "Минимальное число симвовлов 3")
    @NotBlank(message = "Имя не должно быть пустым")
    private String name;
    @Size(min = 11, max = 11, message = "Номер телефона должен содержать 11 символов")
    @NotBlank(message = "Номер телефона не должен быть пустым")
    private String phone;
    @Email
    @Size(min = 6)
    @NotBlank(message = "Email не должен быть пустым")
    private String email;
    @NotBlank(message = "Пароль не должен быть пустым")
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$"
            , message = "Пароль должен содержать минимум 8 символов, одну заглавную букву, " +
            "одну строчную букву, одну цифру и один специальный символ.")
    private String password;
    private Boolean isActive;
}
