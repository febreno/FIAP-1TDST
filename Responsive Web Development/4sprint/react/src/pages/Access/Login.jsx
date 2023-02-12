import { useState, useEffect } from "react"
import { Link } from "react-router-dom"
import Logo3 from '../../img/logo3.png'
import As from '../../img/as.png'
import Gp from '../../img/gp.png'
import Footer from '../../components/footer/Footer'
import './BaseForm.css'

function Login(){

    // let history = useHistory();
    const [codUsuario, setCodUsuario] = useState('');
    const [senha, setSenha] = useState('');
    
    const login = () => {
        const infoLogin = {
            codUsuario: codUsuario,
            senha: senha,
        }
        fetch('http://localhost:8080/Challenge/rest/usuario', {
            method: 'POST',
            body: JSON.stringify(infoLogin),
            headers: {
                'content-type':'application/json'
            }
        })
        .then(resp => resp.json())
        .then(data =>{
            console.log(data.value)
            
            // if (data.value.token != undefined) {
            //     localStorage.setItem('token-inova', data.value.token)
            // }
            // else {
            //     alert('Email ou senha incorretos');
            // }
        })
        .catch(e => console.error(e));
    }

    return(
        <>
        <main>
            <div class="form-data">
                <form name="formuser" onSubmit={event => {event.preventDefault(); login();}}>
                        <div class="logo">
                            <img src={Logo3} alt=""/>
                        </div>
                        <div className='form'>
                            <input type="text" placeholder="Nickname" class="input" onChange={event => setCodUsuario(event.target.value)}/>
                            <input type="text" name="$user" placeholder="Phone number, username, or email" onChange={event => setSenha(event.target.value)}/>
                            <button class="form-btn" type="subimit">Login</button>
                        </div>
                        <span class="has-separator">Or</span>
                        <button class="form-btn-fb">
                                <a class ="facebook-login" href="https://www.facebook.com/">
                                    <div class="icon-fb">
                                        Login com facebook
                                    </div>
                                </a>
                        </button>
                        <a class="password-reset" href="">Esqueceu senha?</a>
                </form>
                <div class="sign-up">
                        Nao tem uma conta? <Link to="/Register">Cadastro</Link>
                </div>
                <div class="get-the-app">
                    <div class="badges">
                        <a href="https://www.appstore.com/"><img src={As}/></a>
                        <a href="https://www.googleplay.com/"><img src={Gp}/></a>
                    </div>
                </div>
            </div>
        </main>
        <Footer/>
        </>
    )
}
export default Login;