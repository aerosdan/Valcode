import { AuthService } from 'src/app/auth.service';
/* import { AuthService } from './../auth.service'; */
import { Route } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Usuario } from './usuario';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent  {

  username: string;
  password: string;
  loginError:boolean;
  cadastrando: boolean;
  errors: String[];

  constructor(
    private router: Router,
    private authService: AuthService
  ) { }

  onSubmit(){
    /* this.router.navigate(['teste/home']) */
    /* console.log(`User: ${this.username}, Pass:${this.password}`) */
    sessionStorage.setItem("user", this.username);
    console.log(this.username, this.password);
    this.authService
          .tentarLogar(this.username, this.password)
          .subscribe(response => {
            console.log(response)
            const access_token = JSON.stringify(response)
            localStorage.setItem('access_token',access_token)
            this.router.navigate(['/teste/home']);
          }, errorResponse => {
            this.loginError = true;
            this.errors = ['CPF ou Senha incorreto(s) ou não cadastrado(s).'];
          });
  }

  preparaCadastrar(event){
    event.preventDefault();
    this.cadastrando = true;
  }

}
