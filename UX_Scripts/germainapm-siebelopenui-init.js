GermainAPM.init({
    beacon_url: 'https://${domain}/ingestion/beacon',
    RT: {enabled: true},
    IframeMonitoring: {enabled: false, eventInit: "page_ready"},
    ClickMonitoring: {enabled: true, frameMonitoringEnabled: false, 
        fullMonitoringEnabled: true, 
        clickContainerLookup: GermainAPMSiebelOpenUIUtils.clickContainerLookup,
        clickLabelLookup: GermainAPMSiebelOpenUIUtils.fieldLabelLookup,
        /*additionalInfoLookup: GermainAPMSiebelOpenUIUtils.additionalInfoLookup,*/
        eventInit: "page_ready", eventClick: "mouseup", 
        hideFieldValueHelper: GermainAPMSiebelOpenUIUtils.hideFieldValueHelper},
    FocusMonitoring: {enabled: true, pushInterval: 15, eventInit: "page_ready"},
    InputMonitoring: {enabled: true},
    MouseMonitoring: {enabled: true, frameMonitoringEnabled: true, snapshotInterval: 100, 
        pushInterval: 15, eventInit: "page_ready"},
    ChangeMonitoring: {enabled : true, eventInit: "page_ready", 
        hideFieldValueHelper: GermainAPMSiebelOpenUIUtils.hideFieldValueHelper, 
        /*additionalInfoLookup: GermainAPMSiebelOpenUIUtils.additionalInfoLookup,*/
        changeLabelLookup: GermainAPMSiebelOpenUIUtils.fieldLabelLookup},
    KeyboardMonitoring: {enabled : true, eventInit: "page_ready"},
    AsyncMonitoring: {enabled : true, requestIndexFilter: GermainAPMSiebelOpenUIUtils.requestIndexFilter, taggingEnabled: false},
    MemoryMonitoring: {enabled: true, eventInit: "page_ready"},
    CpuMonitoring: {enabled: false, repeatSeconds: 60, samplesAveragedPerRound: 12, sampleTimeMillis: 2000, eventInit: "page_ready"},
    VisibilityMonitoring: {enabled: true, eventInit: "page_ready"},
    InactivityMonitoring: {enabled: true, eventInit: "page_ready", threshold: 30},
    StaticResourcesMonitoring: {enabled: true, eventInit: "page_ready" },
    ScrollMonitoring: {enabled: true, snapshotInterval: 1000, pushInterval: 15, eventInit: "page_ready"},
    ResizeMonitoring: {enabled: true, eventInit: "dom_loaded"},
    DomMonitoring: {enabled: true, eventInit: "page_ready", pushInterval: 10, 
        pushFullInterval: 30, changesCountToSendFullBody: 500, dataTimeout: 30000, excludeAriaAttributes: true /*,excludeAttributes:[],excludeIds:[]*/},
    PopupDialogMonitoring: {enabled: true, messageParser: GermainAPMSiebelOpenUIUtils.popupMessageParser},
    ConsoleMonitoring: {enabled: true, nameParser: GermainAPMSiebelOpenUIUtils.consoleNameParser},
	RenderingMonitoring: {enabled: true},
	ScriptingMonitoring: {enabled: true}
}, {
	CORS_PROXY_URL: null,
    SEND_SYNC_ON_UNLOAD: true, // this only applies when the navigator.sendBeacon is unavailable (IE)
    DATA_QUEUE_PUSH_INTERVAL: 10,
    REQUEST_BODY_MONITORING: true, // catch POST request body
    RESPONSE_BODY_MONITORING: true, // catch response body 
    RESPONSE_BODY_PARSER: null,
    PAGE_TITLE: GermainAPMSiebelOpenUIUtils.titleLookup, // extract request title
    DATA_TIMEOUT: 10000, // how long we can try to send collect data back (in ms)
    USER_CLICK: {
        count: 0,
        refreshInterval: 15, // (in seconds) we check periodically if we can close current user click txn and send current cum. txn
        sequence: new Date().getTime() + Math.random().toString(36).substring(6),
        queryStringGenerator: GermainAPMSiebelOpenUIUtils.queryStringGenerator, // user click txn query string extractor
        excludeUrls: [ // exclude http request from user click txn
            /\/marker/,
            /SWECmd=InvokeMethod&SWEService=Message\+Bar&SWEMethod=UpdatePrefMsg/,
            /SWECmd=InvokeMethod&SWEService=SWE\+Command\+Manager&SWEMethod=BatchCanInvoke/,
            /SWEService=Communications/,
            /SWECmd=Login/, 
            /channelservice/, 
            /ie-preamble/, 
            /Ping/,
            /SWECmd=InvokeMethod.*GetWebSessionInfo/,
            /SWECmd=InvokeMethod.*&SWEMethod=GetProfileAttr.*&SWEIPS=/,
            /GetAlarmInstances/
        ]
    },
    EXCLUDE_URLS: [ // exclude data points from monitoring by full URL (including query string)
        /SWEService=Communications/,
        /SWECmd=InvokeMethod&SWEService=Message\+Bar&SWEMethod=UpdatePrefMsg/,
        /SWECmd=InvokeMethod&SWEService=SWE\+Command\+Manager&SWEMethod=BatchCanInvoke/,
        /SWECmd=InvokeMethod.*&SWEMethod=GetProfileAttr.*&SWEIPS=/
    ],
    SESSION_MARKER_END: ["Logout", "Log Out", "Utloggning"]
}, {
    appName: 'Siebel',
    // serverHost: null, // provide if you want to hardcode serverHost value
    username: GermainAPMSiebelOpenUIUtils.usernameLookup,
    session: GermainAPMSiebelOpenUIUtils.sessionLookup,
    cid: GermainAPMSiebelOpenUIUtils.correlationIdLookup
});
