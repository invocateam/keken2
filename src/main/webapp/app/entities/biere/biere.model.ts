
const enum TypeBiere {
    'BLONDE',
    'BRUNE',
    'AMBRE'

};
export class Biere {
    constructor(
        public id?: string,
        public nom?: string,
        public type?: TypeBiere,
        public degreeAlc?: number,
        public brasseur?: string,
        public pays?: string,
        public ville?: string,
        public image?: string,
    ) {
    }
}
