lstUsers = ["Lucas", "Joao", "Jeffersson"]
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
        ,"\n8 Busca vaga"
        ,"\n9 Vizualizar vaga")
    menu = int(input("Type one: "))

    #adm / candidato / recrutador
    if menu == 1:
        print("\nLOGIN USER")
        compareLogin = input("Login: ")
        comparePassword = input("Password: ")
        if compareLogin != "" and comparePassword != "" and len(comparePassword) > 7:
            print("Login Sucess")
            history.append("LOGIN")
        if compareLogin == "" or comparePassword == "" or len(comparePassword) <= 7:
            print("Login or password wrong, pass minimum 8")
            history.append("LOGIN FAIL")

    # candidato / recrutador
    if menu == 2:
        print("\nREGISTER USER")
        userName = input("Seu nome Completo: ")
        login = input("Login: ")
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
        
        #valid email
        email = input("E-mail: ")
        character1,character2,isDigit = 0,0,0 
        while character1 == 0 and character2 == 0 and isDigit == 0:
            character1,character2,isDigit = 0,0,0
            for i in email:
                if i=="@":
                    character1 += 1
                if i==".":
                    character2 += 1
                if i.isdigit():
                    isDigit += 1
        if character1 != 1 and character2 < 0 and isDigit < 0:
            print("Invalid E-mail")
            email = input("E-mail: ")
        if character1 == 1 and character2 > 0 and isDigit > 0:
            print("Email is valid")
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
        lstUsers.append(userName)
        history.append("REGISTER")
    if menu == 3:
        print("\nCREATE JOB")
        titleJob = input("Title Job: ")
        description = input("Description: ")
        socialNetwork =  input("Social network you wish publish: ")
        history.append("NEW JOB")

    if menu == 4:
        print("\nREGISTER IN JOB")
        about = input("Talk about you: ")
        print("Send us an e-mail!")
        history.append("REGISTED IN JOB")
    if menu == 5:
        print("\nSHOW USERS")
        print(lstUsers)
        history.append("SHOW USERS")

    if menu == 6:
        print("\nSHOW HISTORY")
        print(history)
        history.append("SHOW HISTORY")

    if menu == 7:
        print("\nDELETE AN USER")
        deleteUser = input("Adm, type an user for remove: ")
        if deleteUser in lstUsers:
            lstUsers.remove(deleteUser)
            print(f"The User {deleteUser} was deleted")
            print(lstUsers)
            history.append(f"{deleteUser} DELETED")
        else:
            print(f"The user {deleteUser} not found")
            print(lstUsers)
            history.append(f"{deleteUser} FAIL  TO DELETED")
    if menu == 8:
        print("\nBUSCA VAGA")
        history.append("BUSCA VAGA")

    if menu == 9:
        print("\nVIZUALIZAR VAGA")
        history.append("VIZUALIZAR VAGA")