/**
 * Created by xiaoi-010 on 2017/11/13.
 */
$.extend({
    request: {
        getParameter: function (name) {
            var u = window.location.href;
            if(u.indexOf("?")>=0){
                var kvss = u.substring(u.indexOf("?")+1).split("&");
                for(var i=0; i<kvss.length; i++){
                    var kvs = kvss[i].split("=");
                    if(kvs[0] == name){
                        return kvs[1]
                    }
                }

            }
        }
    }
});