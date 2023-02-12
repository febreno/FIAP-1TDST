# FELIPE BRENO SUGISAWA ALTRAN – RM 94170
# LEANDRO ALVES DE SOUZA BRAGA – RM94513
# LEONARDO LIMA BARBOSA – RM 95432
# RAFAELA GOMES DA SILVA – RM 94972
# VINÍCIUS ALVES TORRES – RM 94266

#new verssion
#added valid login, added lstPass, def(functions)
lstLogin = ["Lucas", "Joao", "Jeffersson"]
lstPass=["test1234","test1324", "Test3214"]
lstJob=[]
history = []
menu = -1
while menu != 0:
    print("\nMENU"
        ,"\n0 Stop"
        ,"\n1 Login"#adm / candidato / recrutador
        ,"\n2 Register"#candidato / recrutador
        ,"\n3 Create job"#recrutador
        ,"\n4 Register in job"#candidato
        ,"\n5 Show users"#adm
        ,"\n6 Show history"#adm
        ,"\n7 Delete an user"#adm
        ,"\n8 Busca vaga"#adm / candidato
        ,"\n9 Vizualizar vagas")#adm / candidato
    menu = int(input("Type one: "))

    #adm / candidato / recrutador
    if menu == 1:
        print("\nLOGIN USER")
        compareLogin = input("Login: ")
        comparePass = input("Password: ")
        def loginUser(login,password):
            valid = "fail"
            cont = 0
            while cont < len(lstLogin)-1:
                if login == lstLogin[cont]:
                    if password == lstPass[cont]:
                        print("\nSucces Login!")
                        print("Welcome "+ login)
                        history.append("LOGIN")
                        valid = "ok"
                cont += 1
            if valid == "fail":
                print("\nlogin fail")
        loginUser(compareLogin,comparePass)

    # candidato / recrutador
    if menu == 2:
        print("\nREGISTER USER")
        userName = input("Seu nome Completo: ")
        login = input("Login: ")
        while login in lstLogin:
            login = input("Login: ")
        lstLogin.append(login)
        password = input("Senha: ")
        # valid pass
        isLower,isUpper,isDigit,sCharacter = 0,0,0,0
        while isLower == 0 or isUpper==0 or isDigit == 0 or sCharacter == 0:
            isLower,isUpper,isDigit,sCharacter = 0,0,0,0
            if (len(password) >= 8):
                for i in password: 
                    if i.islower():
                        isLower += 1
                    if i.isupper():
                        isUpper += 1
                    if i.isdigit():
                        isDigit += 1
                    if i=="@" or i=="$" or i=="_" or i =="#" or i =="!" or i=="%" or i=="*":
                        sCharacter += 1
            if isLower<1 or isUpper<1 or isDigit<1 or sCharacter<1:
                print("\nINVALID PASSWORD \nThis need lowercase, more than 7 characters upercase and content one of this characters: @,$,_,#,!,%,*")
                password = input("Password: ")
        if isLower>0 and isUpper>0 and isDigit>0 and sCharacter>0:
            print("\nPASSWORD IS VALID")

        confirmPassword = input("Confirm pass: ")
        while confirmPassword != password:
            print("Passwords are differents")
            confirmPassword = input("Confirm pass: ")
        if confirmPassword == password:
            print("Passwords are the same!")
            lstPass.append(password)
            history.append(f"REGISTER {login}")
        #valid email
        email = input("E-mail: ")
        def validEmail(e):
            character1,character2 = 0,0
            while character1 == 0 and character2 == 0:
                character1,character2 = 0,0
                for i in e:
                    if i=="@":
                        character1 += 1
                    if i==".":
                        character2 += 1
                if character1 != 1 or character2 == 0:
                    print("\nInvalid E-mail")
                    e = input("E-mail: ")
                if character1 == 1 and character2 > 0:
                    print("\nEmail is valid")
                    break
        validEmail(email)
        cpf = int(input("cpf: "))
        candidateOrRecruiter = bool(input("Candidate(False) or Recruiter(True): "))
        bornIn = input("Born in: ")

        haveCompany = int(input("Digite 1 caso trabalhe, \ndigite outra tecla caso nao: "))
        if haveCompany == 1:
            NomeEmpresaAtual = input("Digite o nome da empresa atual: ")
            cnpjEmpresaAtual = int(input("Digite o cnpj da empresa atual: "))
        else:
            NomeEmpresaAtual = "NONE"
            cnpjEmpresaAtual = "NONE"
        active = True
        lstLogin.append(userName)
        history.append("REGISTER ", userName)
    if menu == 3:
        print("\nCREATE JOB")
        titleJob = input("Title Job: ")
        description = input("Description: ")
        typeDev =  input("Type Development: ")
        technologies =  input("Technologies: ")
        lstJob.append((titleJob,description,typeDev,technologies))
        history.append(f"NEW JOB {titleJob}")
        print("\nJOB CREATED")

    #Recrutador
    if menu == 4:
        print("\nREGISTER IN JOB")
        about = input("Talk about you: ")
        print("Send us an e-mail!")
        history.append("REGISTED IN JOB")
    
    # Adm
    if menu == 5:
        print("\nSHOW USERS")
        print(lstLogin)
        history.append("SHOW USERS")

    # Adm
    if menu == 6:
        print("\nSHOW HISTORY")
        print(history)
        history.append("SHOW HISTORY")

    # Adm
    if menu == 7:
        print("\nDELETE AN USER")
        deleteUser = input("Adm, type an user for remove: ")
        def deleteUSer(u, lstL, lstP):#user, listLogin, listPass
            if u in lstL:
                index = lstL.index(u)
                lstP.pop(index)
                lstL.remove(u)
                print(f"The User {u} was deleted")
                print(f"\nALL USERS: \nLogins: {lstL} \nPass: {lstP}")
                history.append(f"{u} DELETED")
            else:
                print(f"\nThe user {u} was not found")
                print(lstL)
                history.append(f"{u} FAIL TO DELETED")
        deleteUSer(deleteUser, lstLogin, lstPass)
    
    #Adm/ Recrutador / Candidato
    if menu == 8:
        print("\nBUSCA VAGA")
        searchJob = input("Name job for search: ")
        history.append("BUSCA VAGA")

    #Adm/ Recrutador / Candidato
    if menu == 9:
        print("\nVIZUALIZAR VAGAS")
        print(lstJob)
        history.append("VIZUALIZAR VAGA")