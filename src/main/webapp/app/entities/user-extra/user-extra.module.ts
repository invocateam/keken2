import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { Keken2SharedModule } from '../../shared';
import {
    UserExtraService,
    UserExtraPopupService,
    UserExtraComponent,
    UserExtraDetailComponent,
    UserExtraDialogComponent,
    UserExtraPopupComponent,
    UserExtraDeletePopupComponent,
    UserExtraDeleteDialogComponent,
    userExtraRoute,
    userExtraPopupRoute,
} from './';

const ENTITY_STATES = [
    ...userExtraRoute,
    ...userExtraPopupRoute,
];

@NgModule({
    imports: [
        Keken2SharedModule,
        RouterModule.forRoot(ENTITY_STATES, { useHash: true })
    ],
    declarations: [
        UserExtraComponent,
        UserExtraDetailComponent,
        UserExtraDialogComponent,
        UserExtraDeleteDialogComponent,
        UserExtraPopupComponent,
        UserExtraDeletePopupComponent,
    ],
    entryComponents: [
        UserExtraComponent,
        UserExtraDialogComponent,
        UserExtraPopupComponent,
        UserExtraDeleteDialogComponent,
        UserExtraDeletePopupComponent,
    ],
    providers: [
        UserExtraService,
        UserExtraPopupService,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class Keken2UserExtraModule {}
