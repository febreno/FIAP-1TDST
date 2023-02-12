import React from 'react'
import './Inputs.css'

export default () => {
    function required(){
        //     var formuser = document.getElementsByClassName("formuser")
        //     alert(formuser)
        //     var fullName = formuser.$fullName.value;
        //     var user = formuser.$user.value;
        //     var pass = formuser.$pass.value;
        //     var confirmPass = formuser.$confirmPass.value;
        //     var email = formuser.$email.value;
        //     var cpf = formuser.$cpf.value;
        //     var CorR = formuser.$CorR.value;
        //     var bornIn = formuser.$bornIn.value;
            
        //     if(fullName == "" && fullName.length <= 4){
        //             alert("Preencha o campo o nome completo.");
        //     }
        //     else if(user == ""){
        //             alert("Preencha o campo nome.");
        //     }
        //     else if(pass == "" || pass.length < 8){
        //             alert("Preencha o campo senha com minimo 5 caracteres");
        //     }
        //     else if(confirmPass != pass || confirmPass == ""){
        //             alert("Confirmacao de senha incorreta");
        //     }
        //     else if(email == "" || email.indexOf('@') == -1 ){
        //             alert("Preencha o campo E-mail");
        //     }
        //     else if(cpf.length != 11){
        //             alert("Preencha o campo cpf");
        //     }
        //     else if(CorR == ""){
        //             alert("Preencha o campo Candidato ou Recrutador");
        //     }
        //     else if(bornIn == "" || bornIn.length != 8){
        //             alert("Preencha corretamente a data (somente 8 numeros)");
        //     }
        //     else{
        //           window.open("./login.html");  
        //     }
    }

    return(
        <div className='form'>
            <label for="$fullName">Nome Completo</label>
            <input name="$fullName" type="text placeholder="/>
            <label for="$user">Nome Usuario</label>
            <input name="$user" type="text"  placeholder="Numero, username ou e-mail"/>
            <label for="$pass">Senha</label>
            <input type="password" name="$pass" placeholder="Coloque uma senha dificil"/>
            <label for="$confirmPass">Confirme a Senha</label>
            <input type="password" name="$confirmPass" placeholder="Confirme a Senha"/>
            <label for="$email">E-mail</label>
            <input type="text" name="$email" placeholder="E-mail"/>
            <label for="$cpf">CPF</label>
            <input type="text" name="$cpf" placeholder="Cpf"/>
            <label for="CorR">Candidato ou recrutador</label>
            <input type="text" name="$CorR" placeholder="Cada um com sua funcao"/>
            <label for="$bornIn">Data de Nascimento</label>
            <input type="text" name="$bornIn" placeholder="dia/mes/ano"/>
            <button type="text" value="Submit" onclick={required()} class="form-btn">Login</button>
        </div>
    )
}