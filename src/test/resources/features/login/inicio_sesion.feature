
# language: es

Característica: Inicio de sesión
  Yo como analista de negocio necesito registrarme y hacer login en el sitio web

  @RegistroUsuario
  Escenario: Registrar nuevo usuario
    Dado que el usuario entra a la pagina principal
    Cuando el usuario hace clik en la opcion sign up para registrarse
    Cuando aparece la ventana para registrarse
    Cuando coloca usuario JuanTest12345
    Cuando coloca contrasena 123456
    Cuando doy click en el boton de registro
    Entonces prueba que el alert aparezca con el registro exitoso

  @Login
  Escenario: entrar como usuario
    Dado que el usuario entra a la ventana login
    Dado El usuario entra JuanTest12345 y 123456
    Dado El usuario da click en boton login
    Dado entra como usuario y aparece la premisa welcome
