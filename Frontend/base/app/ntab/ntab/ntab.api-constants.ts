import { NtabBase} from '@baseapp/ntab/ntab/ntab.base.model';

export class NtabApiConstants {
    public static readonly getDatatableData: any = {
        url: '/rest/ntabs/datatable',
        method: 'POST',
        showloading: true
    };
    public static readonly delete: any = {
        url: '/rest/ntabs/{ids}',
        method: 'DELETE',
        showloading: true
    };
    public static readonly create: any = {
        url: '/rest/ntabs/',
        method: 'POST',
        showloading: true
    };
    public static readonly getById: any = {
        url: '/rest/ntabs/{sid}',
        method: 'GET',
        showloading: true
    };
    public static readonly update: any = {
        url: '/rest/ntabs/',
        method: 'PUT',
        showloading: true
    };
    public static readonly autoSuggestService: any = {
        url: '/rest/ntabs/autosuggest',
        method: 'GET',
        showloading: true
    };
}