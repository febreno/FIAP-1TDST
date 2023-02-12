import React from 'react'
import ContentLogin from '../../components/contentForm/ContentLogin'
import Logo3 from '../../img/logo3.png'
import As from '../../img/as.png'
import Gp from '../../img/gp.png'
import './BaseForm.css'

export default () =>{
    return(
        <div class="form-data">
            <form name="formuser">
                    <div class="logo">
                        <img src={Logo3} alt=""/>
                    </div>
                    {/* inputs */}
                    <ContentLogin/>
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
                    Nao tem uma conta? <a href="./register.html">Cadastro</a>
            </div>
            <div class="get-the-app">
                    <div class="badges">
                            <a href="https://www.apple.com/app-store/"><img src={As}/></a>
                            <a href="https://play.google.com/store?hl=pt_BR&gl=US"><img src={Gp}/></a>
                    </div>
            </div>
        </div>
    )
}