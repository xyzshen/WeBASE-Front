/**
 * Copyright 2014-2020 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.webank.webase.front.contractStore;

/**
 * Smart-Dev-Contracts evidence template
 * @author marsli
 */
public class SmartDevConstantContext {

    public static final String EVI_CONTROLLER_SOURCE = "Ci8qCiAqIENvcHlyaWdodCAyMDE0LTIwMTkgdGhlIG9yaWdpbmFsIGF1dGhvciBvciBhdXRob3JzLgogKgogKiBMaWNlbnNlZCB1bmRlciB0aGUgQXBhY2hlIExpY2Vuc2UsIFZlcnNpb24gMi4wICh0aGUgIkxpY2Vuc2UiKTsKICogeW91IG1heSBub3QgdXNlIHRoaXMgZmlsZSBleGNlcHQgaW4gY29tcGxpYW5jZSB3aXRoIHRoZSBMaWNlbnNlLgogKiBZb3UgbWF5IG9idGFpbiBhIGNvcHkgb2YgdGhlIExpY2Vuc2UgYXQKICoKICogICAgICBodHRwOi8vd3d3LmFwYWNoZS5vcmcvbGljZW5zZXMvTElDRU5TRS0yLjAKICoKICogVW5sZXNzIHJlcXVpcmVkIGJ5IGFwcGxpY2FibGUgbGF3IG9yIGFncmVlZCB0byBpbiB3cml0aW5nLCBzb2Z0d2FyZQogKiBkaXN0cmlidXRlZCB1bmRlciB0aGUgTGljZW5zZSBpcyBkaXN0cmlidXRlZCBvbiBhbiAiQVMgSVMiIEJBU0lTLAogKiBXSVRIT1VUIFdBUlJBTlRJRVMgT1IgQ09ORElUSU9OUyBPRiBBTlkgS0lORCwgZWl0aGVyIGV4cHJlc3Mgb3IgaW1wbGllZC4KICogU2VlIHRoZSBMaWNlbnNlIGZvciB0aGUgc3BlY2lmaWMgbGFuZ3VhZ2UgZ292ZXJuaW5nIHBlcm1pc3Npb25zIGFuZAogKiBsaW1pdGF0aW9ucyB1bmRlciB0aGUgTGljZW5zZS4KICogKi8KCnByYWdtYSBzb2xpZGl0eSA+PTAuNC4yNCA8MC42LjExOyAKCmltcG9ydCAiLi9SZXF1ZXN0UmVwb3NpdG9yeS5zb2wiOwppbXBvcnQgIi4vRXZpZGVuY2VSZXBvc2l0b3J5LnNvbCI7Cgpjb250cmFjdCBFdmlkZW5jZUNvbnRyb2xsZXJ7CiAgICBSZXF1ZXN0UmVwb3NpdG9yeSBwdWJsaWMgX3JlcXVlc3RSZXBvOwogICAgRXZpZGVuY2VSZXBvc2l0b3J5IHB1YmxpYyBfZXZpZGVuY2VSZXBvOwoKICAgIGV2ZW50IENyZWF0ZVNhdmVSZXF1ZXN0KGJ5dGVzMzIgaW5kZXhlZCBoYXNoLCBhZGRyZXNzIGNyZWF0b3IpOyAgIAogICAgZXZlbnQgVm90ZVNhdmVSZXF1ZXN0KGJ5dGVzMzIgaW5kZXhlZCBoYXNoLCBhZGRyZXNzIHZvdGVyLCBib29sIGNvbXBsZXRlKTsKICAgIGV2ZW50IEV2aWRlbmNlU2F2ZWQoYnl0ZXMzMiBpbmRleGVkIGhhc2gpOwoKICAgIGNvbnN0cnVjdG9yKHVpbnQ4IHRocmVzaG9sZCwgYWRkcmVzc1tdIG1lbW9yeSB2b3RlckFycmF5KSBwdWJsaWN7CiAgICAgICAgX3JlcXVlc3RSZXBvID0gbmV3IFJlcXVlc3RSZXBvc2l0b3J5KHRocmVzaG9sZCwgdm90ZXJBcnJheSk7CiAgICAgICAgX2V2aWRlbmNlUmVwbyA9IG5ldyBFdmlkZW5jZVJlcG9zaXRvcnkoKTsKICAgIH0KCiAgICBtb2RpZmllciB2YWxpZGF0ZUhhc2goYnl0ZXMzMiBoYXNoKXsKICAgICAgcmVxdWlyZShoYXNoICE9IDAsICJOb3QgdmFsaWQgaGFzaCIpOwogICAgICBfOwogICAgfQoKICAgIGZ1bmN0aW9uIGNyZWF0ZVNhdmVSZXF1ZXN0KGJ5dGVzMzIgaGFzaCwgYnl0ZXMgbWVtb3J5IGV4dCkgcHVibGljIHZhbGlkYXRlSGFzaChoYXNoKXsKICAgICAgICBfcmVxdWVzdFJlcG8uY3JlYXRlU2F2ZVJlcXVlc3QoaGFzaCwgbXNnLnNlbmRlciwgZXh0KTsKICAgICAgICBlbWl0IENyZWF0ZVNhdmVSZXF1ZXN0KGhhc2gsIG1zZy5zZW5kZXIpOwogICAgfQoKICAgIGZ1bmN0aW9uIHZvdGVTYXZlUmVxdWVzdChieXRlczMyIGhhc2gpIHB1YmxpYyB2YWxpZGF0ZUhhc2goaGFzaCkgcmV0dXJucyhib29sKXsKICAgICAgICBib29sIGIgPSBfcmVxdWVzdFJlcG8udm90ZVNhdmVSZXF1ZXN0KGhhc2gsIG1zZy5zZW5kZXIpOwogICAgICAgIGlmKCFiKSB7CiAgICAgICAgICAgIHJldHVybiBmYWxzZTsKICAgICAgICB9CiAgICAgICAgKGJ5dGVzMzIgaCwgYWRkcmVzcyBjcmVhdG9yLCBieXRlcyBtZW1vcnkgZXh0LCAgdWludDggdm90ZWQsIHVpbnQ4IHRocmVzaG9sZCkgPSAgX3JlcXVlc3RSZXBvLmdldFJlcXVlc3REYXRhKGhhc2gpOwogICAgICAgIGJvb2wgcGFzc2VkID0gdm90ZWQgPj0gdGhyZXNob2xkOwogICAgICAgIGVtaXQgVm90ZVNhdmVSZXF1ZXN0KGhhc2gsIG1zZy5zZW5kZXIsIHBhc3NlZCk7CiAgICAgICAgaWYocGFzc2VkKXsKICAgICAgICAgICAgX2V2aWRlbmNlUmVwby5zZXREYXRhKGhhc2gsIGNyZWF0b3IsIG5vdyk7CiAgICAgICAgICAgIF9yZXF1ZXN0UmVwby5kZWxldGVTYXZlUmVxdWVzdChoYXNoKTsKICAgICAgICAgICAgZW1pdCBFdmlkZW5jZVNhdmVkKGhhc2gpOwogICAgICAgIH0KICAgICAgICByZXR1cm4gdHJ1ZTsKICAgIH0KCiAgICBmdW5jdGlvbiBnZXRSZXF1ZXN0RGF0YShieXRlczMyIGhhc2gpIHB1YmxpYyB2aWV3IAogICAgICByZXR1cm5zKGJ5dGVzMzIsIGFkZHJlc3MgY3JlYXRvciwgYnl0ZXMgbWVtb3J5IGV4dCwgdWludDggdm90ZWQsIHVpbnQ4IHRocmVzaG9sZCl7CiAgICAgICAgcmV0dXJuIF9yZXF1ZXN0UmVwby5nZXRSZXF1ZXN0RGF0YShoYXNoKTsKICAgIH0KCiAgICBmdW5jdGlvbiBnZXRFdmlkZW5jZShieXRlczMyIGhhc2gpIHB1YmxpYyB2aWV3IHJldHVybnMoYnl0ZXMzMiAsIGFkZHJlc3MsIHVpbnQpewogICAgICAgIHJldHVybiBfZXZpZGVuY2VSZXBvLmdldERhdGEoaGFzaCk7CiAgICB9Cn0K";
    public static final String EVI_REPO_SOURCE = "LyoKICogQ29weXJpZ2h0IDIwMTQtMjAxOSB0aGUgb3JpZ2luYWwgYXV0aG9yIG9yIGF1dGhvcnMuCiAqCiAqIExpY2Vuc2VkIHVuZGVyIHRoZSBBcGFjaGUgTGljZW5zZSwgVmVyc2lvbiAyLjAgKHRoZSAiTGljZW5zZSIpOwogKiB5b3UgbWF5IG5vdCB1c2UgdGhpcyBmaWxlIGV4Y2VwdCBpbiBjb21wbGlhbmNlIHdpdGggdGhlIExpY2Vuc2UuCiAqIFlvdSBtYXkgb2J0YWluIGEgY29weSBvZiB0aGUgTGljZW5zZSBhdAogKgogKiAgICAgIGh0dHA6Ly93d3cuYXBhY2hlLm9yZy9saWNlbnNlcy9MSUNFTlNFLTIuMAogKgogKiBVbmxlc3MgcmVxdWlyZWQgYnkgYXBwbGljYWJsZSBsYXcgb3IgYWdyZWVkIHRvIGluIHdyaXRpbmcsIHNvZnR3YXJlCiAqIGRpc3RyaWJ1dGVkIHVuZGVyIHRoZSBMaWNlbnNlIGlzIGRpc3RyaWJ1dGVkIG9uIGFuICJBUyBJUyIgQkFTSVMsCiAqIFdJVEhPVVQgV0FSUkFOVElFUyBPUiBDT05ESVRJT05TIE9GIEFOWSBLSU5ELCBlaXRoZXIgZXhwcmVzcyBvciBpbXBsaWVkLgogKiBTZWUgdGhlIExpY2Vuc2UgZm9yIHRoZSBzcGVjaWZpYyBsYW5ndWFnZSBnb3Zlcm5pbmcgcGVybWlzc2lvbnMgYW5kCiAqIGxpbWl0YXRpb25zIHVuZGVyIHRoZSBMaWNlbnNlLgogKiAqLwoKcHJhZ21hIHNvbGlkaXR5ID49MC40LjI0IDwwLjYuMTE7CmltcG9ydCAiLi9BdXRoZW50aWNhdGlvbi5zb2wiOwoKY29udHJhY3QgRXZpZGVuY2VSZXBvc2l0b3J5IGlzIEF1dGhlbnRpY2F0aW9uIHsgICAgCiAgICBzdHJ1Y3QgRXZpZGVuY2VEYXRhewogICAgICAgIGJ5dGVzMzIgaGFzaDsKICAgICAgICBhZGRyZXNzIG93bmVyOwogICAgICAgIHVpbnQgdGltZXN0YW1wOwogICAgfQogICAgbWFwcGluZyhieXRlczMyPT5FdmlkZW5jZURhdGEpIHByaXZhdGUgX2V2aWRlbmNlczsgIAogICAgCiAgICBmdW5jdGlvbiBzZXREYXRhKGJ5dGVzMzIgaGFzaCwgYWRkcmVzcyBvd25lciwgdWludCB0aW1lc3RhbXApIHB1YmxpYyBhdXRoIHsKICAgICAgICBfZXZpZGVuY2VzW2hhc2hdLmhhc2ggPSBoYXNoOwogICAgICAgIF9ldmlkZW5jZXNbaGFzaF0ub3duZXIgPSBvd25lcjsKICAgICAgICBfZXZpZGVuY2VzW2hhc2hdLnRpbWVzdGFtcCA9IHRpbWVzdGFtcDsKICAgIH0KICAgIAogICAgZnVuY3Rpb24gZ2V0RGF0YShieXRlczMyIGhhc2gpIHB1YmxpYyB2aWV3IHJldHVybnMoYnl0ZXMzMiAsIGFkZHJlc3MsIHVpbnQpewogICAgICAgIEV2aWRlbmNlRGF0YSBzdG9yYWdlIGV2aWRlbmNlID0gX2V2aWRlbmNlc1toYXNoXTsKICAgICAgICByZXF1aXJlKGV2aWRlbmNlLmhhc2ggPT0gaGFzaCwgIkV2aWRlbmNlIG5vdCBleGlzdCIpOwogICAgICAgIHJldHVybiAoZXZpZGVuY2UuaGFzaCwgZXZpZGVuY2Uub3duZXIsIGV2aWRlbmNlLnRpbWVzdGFtcCk7CiAgICB9Cn0K";
    public static final String REQUEST_REPO_SOURCE = "LyoKICogQ29weXJpZ2h0IDIwMTQtMjAxOSB0aGUgb3JpZ2luYWwgYXV0aG9yIG9yIGF1dGhvcnMuCiAqCiAqIExpY2Vuc2VkIHVuZGVyIHRoZSBBcGFjaGUgTGljZW5zZSwgVmVyc2lvbiAyLjAgKHRoZSAiTGljZW5zZSIpOwogKiB5b3UgbWF5IG5vdCB1c2UgdGhpcyBmaWxlIGV4Y2VwdCBpbiBjb21wbGlhbmNlIHdpdGggdGhlIExpY2Vuc2UuCiAqIFlvdSBtYXkgb2J0YWluIGEgY29weSBvZiB0aGUgTGljZW5zZSBhdAogKgogKiAgICAgIGh0dHA6Ly93d3cuYXBhY2hlLm9yZy9saWNlbnNlcy9MSUNFTlNFLTIuMAogKgogKiBVbmxlc3MgcmVxdWlyZWQgYnkgYXBwbGljYWJsZSBsYXcgb3IgYWdyZWVkIHRvIGluIHdyaXRpbmcsIHNvZnR3YXJlCiAqIGRpc3RyaWJ1dGVkIHVuZGVyIHRoZSBMaWNlbnNlIGlzIGRpc3RyaWJ1dGVkIG9uIGFuICJBUyBJUyIgQkFTSVMsCiAqIFdJVEhPVVQgV0FSUkFOVElFUyBPUiBDT05ESVRJT05TIE9GIEFOWSBLSU5ELCBlaXRoZXIgZXhwcmVzcyBvciBpbXBsaWVkLgogKiBTZWUgdGhlIExpY2Vuc2UgZm9yIHRoZSBzcGVjaWZpYyBsYW5ndWFnZSBnb3Zlcm5pbmcgcGVybWlzc2lvbnMgYW5kCiAqIGxpbWl0YXRpb25zIHVuZGVyIHRoZSBMaWNlbnNlLgogKiAqLwoKcHJhZ21hIHNvbGlkaXR5ID49MC40LjI0IDwwLjYuMTE7CgppbXBvcnQgIi4vQXV0aGVudGljYXRpb24uc29sIjsKCmNvbnRyYWN0IFJlcXVlc3RSZXBvc2l0b3J5IGlzIEF1dGhlbnRpY2F0aW9ueyAgICAKICAgIHN0cnVjdCBTYXZlUmVxdWVzdHsKICAgICAgICBieXRlczMyIGhhc2g7CiAgICAgICAgYWRkcmVzcyBjcmVhdG9yOwogICAgICAgIHVpbnQ4IHZvdGVkOwogICAgICAgIGJ5dGVzIGV4dDsKICAgICAgICBtYXBwaW5nKGFkZHJlc3M9PmJvb2wpIHN0YXR1czsKICAgIH0KICAgIHVpbnQ4IHB1YmxpYyBfdGhyZXNob2xkOwogICAgbWFwcGluZyhieXRlczMyPT5TYXZlUmVxdWVzdCkgcHJpdmF0ZSBfc2F2ZVJlcXVlc3RzOwogICAgbWFwcGluZyhhZGRyZXNzPT5ib29sKSBwcml2YXRlIF92b3RlcnM7CiAgICAKICAgIGNvbnN0cnVjdG9yKHVpbnQ4IHRocmVzaG9sZCwgYWRkcmVzc1tdIG1lbW9yeSB2b3RlckFycmF5KSBwdWJsaWN7CiAgICAgICAgX3RocmVzaG9sZCA9IHRocmVzaG9sZDsKICAgICAgICBmb3IodWludCBpPTA7aTx2b3RlckFycmF5Lmxlbmd0aDtpKyspewogICAgICAgICAgICBfdm90ZXJzW3ZvdGVyQXJyYXlbaV1dID0gdHJ1ZTsKICAgICAgICB9CiAgICB9CgogICAgZnVuY3Rpb24gY3JlYXRlU2F2ZVJlcXVlc3QoYnl0ZXMzMiBoYXNoLCBhZGRyZXNzIG93bmVyLCBieXRlcyBtZW1vcnkgZXh0KSBwdWJsaWMgYXV0aHsKICAgICAgICByZXF1aXJlKF9zYXZlUmVxdWVzdHNbaGFzaF0uaGFzaCA9PSAwLCAicmVxdWVzdCBhbHJlYWR5IGV4aXN0ZWQiKTsKICAgICAgICBfc2F2ZVJlcXVlc3RzW2hhc2hdLmhhc2ggPSBoYXNoOwogICAgICAgIF9zYXZlUmVxdWVzdHNbaGFzaF0uY3JlYXRvciA9IG93bmVyOwogICAgICAgIF9zYXZlUmVxdWVzdHNbaGFzaF0uZXh0ID0gZXh0OwogICAgfQoKICAgIGZ1bmN0aW9uIHZvdGVTYXZlUmVxdWVzdChieXRlczMyIGhhc2gsIGFkZHJlc3Mgdm90ZXIpIHB1YmxpYyBhdXRoIHJldHVybnMgKGJvb2wpewogICAgICAgIHJlcXVpcmUoX3ZvdGVyc1t2b3Rlcl0gPT0gdHJ1ZSwgIk5vdCBhbGxvd2VkIHRvIHZvdGUiKTsKICAgICAgICByZXF1aXJlKF9zYXZlUmVxdWVzdHNbaGFzaF0uaGFzaCA9PSBoYXNoLCAicmVxdWVzdCBub3QgZm91bmQiKTsKICAgICAgICBTYXZlUmVxdWVzdCBzdG9yYWdlIHJlcXVlc3QgPSBfc2F2ZVJlcXVlc3RzW2hhc2hdOwogICAgICAgIHJlcXVpcmUocmVxdWVzdC5zdGF0dXNbdm90ZXJdID09IGZhbHNlLCAiVm90ZXIgYWxyZWFkeSB2b3RlZCIpOwogICAgICAgIHJlcXVlc3Quc3RhdHVzW3ZvdGVyXSA9IHRydWU7CiAgICAgICAgcmVxdWVzdC52b3RlZCsrOwogICAgICAgIHJldHVybiB0cnVlOwogICAgfQogICAgCiAgICBmdW5jdGlvbiBnZXRSZXF1ZXN0RGF0YShieXRlczMyIGhhc2gpIHB1YmxpYyB2aWV3IAogICAgICByZXR1cm5zKGJ5dGVzMzIsIGFkZHJlc3MgY3JlYXRvciwgYnl0ZXMgbWVtb3J5IGV4dCwgdWludDggdm90ZWQsIHVpbnQ4IHRocmVzaG9sZCl7CiAgICAgICAgU2F2ZVJlcXVlc3Qgc3RvcmFnZSByZXF1ZXN0ID0gX3NhdmVSZXF1ZXN0c1toYXNoXTsKICAgICAgICByZXF1aXJlKF9zYXZlUmVxdWVzdHNbaGFzaF0uaGFzaCA9PSBoYXNoLCAicmVxdWVzdCBub3QgZm91bmQiKTsKICAgICAgICByZXR1cm4gKGhhc2gsIHJlcXVlc3QuY3JlYXRvciwgcmVxdWVzdC5leHQsIHJlcXVlc3Qudm90ZWQsIF90aHJlc2hvbGQpOwogICAgfQoKICAgIGZ1bmN0aW9uIGRlbGV0ZVNhdmVSZXF1ZXN0KGJ5dGVzMzIgaGFzaCkgcHVibGljIGF1dGggewogICAgICAgIHJlcXVpcmUoX3NhdmVSZXF1ZXN0c1toYXNoXS5oYXNoID09IGhhc2gsICJyZXF1ZXN0IG5vdCBmb3VuZCIpOwogICAgICAgIGRlbGV0ZSBfc2F2ZVJlcXVlc3RzW2hhc2hdOwogICAgfQp9Cg==";
    public static final String AUTH_SOURCE = "LyoKICogQ29weXJpZ2h0IDIwMTQtMjAxOSB0aGUgb3JpZ2luYWwgYXV0aG9yIG9yIGF1dGhvcnMuCiAqCiAqIExpY2Vuc2VkIHVuZGVyIHRoZSBBcGFjaGUgTGljZW5zZSwgVmVyc2lvbiAyLjAgKHRoZSAiTGljZW5zZSIpOwogKiB5b3UgbWF5IG5vdCB1c2UgdGhpcyBmaWxlIGV4Y2VwdCBpbiBjb21wbGlhbmNlIHdpdGggdGhlIExpY2Vuc2UuCiAqIFlvdSBtYXkgb2J0YWluIGEgY29weSBvZiB0aGUgTGljZW5zZSBhdAogKgogKiAgICAgIGh0dHA6Ly93d3cuYXBhY2hlLm9yZy9saWNlbnNlcy9MSUNFTlNFLTIuMAogKgogKiBVbmxlc3MgcmVxdWlyZWQgYnkgYXBwbGljYWJsZSBsYXcgb3IgYWdyZWVkIHRvIGluIHdyaXRpbmcsIHNvZnR3YXJlCiAqIGRpc3RyaWJ1dGVkIHVuZGVyIHRoZSBMaWNlbnNlIGlzIGRpc3RyaWJ1dGVkIG9uIGFuICJBUyBJUyIgQkFTSVMsCiAqIFdJVEhPVVQgV0FSUkFOVElFUyBPUiBDT05ESVRJT05TIE9GIEFOWSBLSU5ELCBlaXRoZXIgZXhwcmVzcyBvciBpbXBsaWVkLgogKiBTZWUgdGhlIExpY2Vuc2UgZm9yIHRoZSBzcGVjaWZpYyBsYW5ndWFnZSBnb3Zlcm5pbmcgcGVybWlzc2lvbnMgYW5kCiAqIGxpbWl0YXRpb25zIHVuZGVyIHRoZSBMaWNlbnNlLgogKiAqLwoKcHJhZ21hIHNvbGlkaXR5ID49MC40LjI0IDwwLjYuMTE7Cgpjb250cmFjdCBBdXRoZW50aWNhdGlvbnsKICAgIGFkZHJlc3MgcHVibGljIF9vd25lcjsKICAgIG1hcHBpbmcoYWRkcmVzcz0+Ym9vbCkgcHJpdmF0ZSBfYWNsOwoKICAgIGNvbnN0cnVjdG9yKCkgcHVibGljewogICAgICBfb3duZXIgPSBtc2cuc2VuZGVyOwogICAgfSAKCiAgICBtb2RpZmllciBvbmx5T3duZXIoKXsKICAgICAgcmVxdWlyZShtc2cuc2VuZGVyID09IF9vd25lciwgIk5vdCBhZG1pbiIpOwogICAgICBfOwogICAgfQoKICAgIG1vZGlmaWVyIGF1dGgoKXsKICAgICAgcmVxdWlyZShtc2cuc2VuZGVyID09IF9vd25lciB8fCBfYWNsW21zZy5zZW5kZXJdPT10cnVlLCAiTm90IGF1dGhlbnRpY2F0ZWQiKTsKICAgICAgXzsKICAgIH0KCiAgICBmdW5jdGlvbiBhbGxvdyhhZGRyZXNzIGFkZHIpIHB1YmxpYyBvbmx5T3duZXJ7CiAgICAgIF9hY2xbYWRkcl0gPSB0cnVlOwogICAgfQoKICAgIGZ1bmN0aW9uIGRlbnkoYWRkcmVzcyBhZGRyKSBwdWJsaWMgb25seU93bmVyewogICAgICBfYWNsW2FkZHJdID0gZmFsc2U7CiAgICB9Cn0K";

    public final static String EVIDENCE_API_MD = "# Evidence存证\n"
        + "\n"
        + "## 简介\n"
        + "\n"
        + "存证操作，上传、审批、修改、删除等，详情查看[Smart-Dev Evidence Doc](https://toolkit-doc.readthedocs.io/zh_CN/latest/docs/WeBankBlockchain-SmartDev-Contract/api/business_template/Evidence.html)\n"
        + "\n"
        + "合约：\n"
        + "1) EvidenceController 对外服务的唯一接口\n"
        + "2) EvidenceRepository 辅助合约，用于数据和逻辑分离\n"
        + "3) RequestRepository 辅助合约，用于数据和逻辑分离\n"
        + "4) Authentication 辅助合约，用于数据和逻辑分离";


}