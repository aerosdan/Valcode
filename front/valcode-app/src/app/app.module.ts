import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { FooterComponent } from './template/footer/footer.component';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatListModule} from '@angular/material/list';

import { TemplateModule } from './template/template.module';
import { HomeComponent } from './home/home.component';
import { TransacoesModule } from './transacoes/transacoes.module';
import { TransacoesService } from './transacoes.service';
import { ForgotpasswordComponent } from './views/forgotpassword/forgotpassword.component';
import { GerenciadorComponent } from './views/gerenciador/gerenciador.component';
import { HelperComponent } from './views/helper/helper.component';
import { LoginComponent } from './login/login.component';
import { MeuperfilComponent } from './views/meuperfil/meuperfil.component';
import { PontosComponent } from './views/pontos/pontos.component';
import { RegisterComponent } from './views/register/register.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LayoutComponent } from './layout/layout.component';
import { AuthService } from './auth.service';

@NgModule({
  declarations: [

    AppComponent,
    FooterComponent,
    HomeComponent,
    ForgotpasswordComponent,
    GerenciadorComponent,
    HelperComponent,
    LoginComponent,
    MeuperfilComponent,
    PontosComponent,
    RegisterComponent,
    LayoutComponent

  ],
  imports: [
    FormsModule,
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    TemplateModule,

    TransacoesModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatListModule
  ],
  providers: [

    TransacoesService,
    AuthService

  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
