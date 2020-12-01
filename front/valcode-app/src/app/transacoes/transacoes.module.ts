import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { TransacoesRoutingModule } from './transacoes-routing.module';
import { TransacoesFormComponent } from './transacoes-form/transacoes-form.component';
import { TransacoesListaComponent } from './transacoes-lista/transacoes-lista.component';


@NgModule({
  declarations: [
    TransacoesFormComponent,
    TransacoesListaComponent
  ],
  imports: [  
    CommonModule,
    TransacoesRoutingModule,
    FormsModule
  ],
  exports: [
    TransacoesFormComponent,
    TransacoesListaComponent
  ]


})
export class TransacoesModule { }
