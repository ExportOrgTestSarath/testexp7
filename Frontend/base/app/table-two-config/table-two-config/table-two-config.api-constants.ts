import { TableTwoConfigBase} from '@baseapp/table-two-config/table-two-config/table-two-config.base.model';

export class TableTwoConfigApiConstants {
    public static readonly getDatatableData: any = {
        url: '/rest/tabletwoconfigs/datatable',
        method: 'POST',
        showloading: true
    };
    public static readonly delete: any = {
        url: '/rest/tabletwoconfigs/{ids}',
        method: 'DELETE',
        showloading: true
    };
    public static readonly getByEmbed: any = {
        url: '/rest/tabletwoconfigs/byembed/{embed}',
        method: 'GET',
        showloading: true
    };
    public static readonly getById: any = {
        url: '/rest/tabletwoconfigs/{sid}',
        method: 'GET',
        showloading: true
    };
    public static readonly create: any = {
        url: '/rest/tabletwoconfigs/',
        method: 'POST',
        showloading: true
    };
    public static readonly autoSuggestService: any = {
        url: '/rest/tabletwoconfigs/autosuggest',
        method: 'GET',
        showloading: true
    };
    public static readonly update: any = {
        url: '/rest/tabletwoconfigs/',
        method: 'PUT',
        showloading: true
    };
}