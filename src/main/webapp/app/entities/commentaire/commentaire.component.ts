import { Component, OnInit, OnDestroy } from '@angular/core';
import { Response } from '@angular/http';
import { ActivatedRoute, Router } from '@angular/router';
import { Subscription } from 'rxjs/Rx';
import { EventManager, ParseLinks, PaginationUtil, JhiLanguageService, AlertService } from 'ng-jhipster';

import { Commentaire } from './commentaire.model';
import { CommentaireService } from './commentaire.service';
import { ITEMS_PER_PAGE, Principal } from '../../shared';
import { PaginationConfig } from '../../blocks/config/uib-pagination.config';

@Component({
    selector: 'jhi-commentaire',
    templateUrl: './commentaire.component.html'
})
export class CommentaireComponent implements OnInit, OnDestroy {
commentaires: Commentaire[];
    currentAccount: any;
    eventSubscriber: Subscription;

    constructor(
        private commentaireService: CommentaireService,
        private alertService: AlertService,
        private eventManager: EventManager,
        private principal: Principal
    ) {
    }

    loadAll() {
        this.commentaireService.query().subscribe(
            (res: Response) => {
                this.commentaires = res.json();
            },
            (res: Response) => this.onError(res.json())
        );
    }
    ngOnInit() {
        this.loadAll();
        this.principal.identity().then((account) => {
            this.currentAccount = account;
        });
        this.registerChangeInCommentaires();
    }

    ngOnDestroy() {
        this.eventManager.destroy(this.eventSubscriber);
    }

    trackId(index: number, item: Commentaire) {
        return item.id;
    }
    registerChangeInCommentaires() {
        this.eventSubscriber = this.eventManager.subscribe('commentaireListModification', (response) => this.loadAll());
    }

    private onError(error) {
        this.alertService.error(error.message, null, null);
    }
}
