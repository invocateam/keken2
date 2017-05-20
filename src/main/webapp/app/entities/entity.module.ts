import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { Keken2BiereModule } from './biere/biere.module';
import { Keken2CommentaireModule } from './commentaire/commentaire.module';
import { Keken2UserExtraModule } from './user-extra/user-extra.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    imports: [
        Keken2BiereModule,
        Keken2CommentaireModule,
        Keken2UserExtraModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class Keken2EntityModule {}
