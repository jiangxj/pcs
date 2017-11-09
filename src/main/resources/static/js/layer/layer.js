(function(exports) {
    exports.layer = {
        confirm: function(option) {
            var opt = option || {};
            var title = opt.title || "消息";
            var content = opt.content || "如果是请点击确定按钮 ，否则请点取消。";
            var sureText = opt.sure || "确定";
            var cancelText = opt.cancel || "取消";
            var sureFunc = opt.sureFunc || function(){};
            var cancelFunc = opt.cancelFunc || function(){};
            var divNode = window.document.createElement("div");
            divNode.setAttribute("class", "tip");
            divNode.style.display = 'block';

            var tiptop = document.createElement("div");
            tiptop.setAttribute("class", "tiptop");

            var tiptop_span = document.createElement("span");
            tiptop_span.innerHTML = title;

            var tiptop_a = document.createElement("a");

            tiptop.appendChild(tiptop_span);
            tiptop.appendChild(tiptop_a);

            var tipinfo = document.createElement("div");
            tipinfo.setAttribute("class", "tipinfo clearfix");

            var tipinfo_span = document.createElement("span");

            var tipinfo_span_img = document.createElement("img");
            tipinfo_span_img.src = "images/ticon.png";
            tipinfo_span.appendChild(tipinfo_span_img);

            var tipright = document.createElement("div");
            tipright.setAttribute("class", "tipright");

            var tipright_p = document.createElement("p");
            tipright_p.innerHTML = content;

            var tipright_cite = document.createElement("cite");
            tipright_cite.innerHTML = "如果是请点击确定按钮 ，否则请点取消。";

            tipright.appendChild(tipright_p);
            tipright.appendChild(tipright_cite);

            tipinfo.appendChild(tipinfo_span);
            tipinfo.appendChild(tipright);

            var tipbtn = document.createElement("div");
            tipbtn.setAttribute("class", "tipbtn");

            var tipbtn_sure = document.createElement("input");
            tipbtn_sure.setAttribute("class", "sure");
            tipbtn_sure.setAttribute("type", "button");
            tipbtn_sure.value = sureText;

            var tipbtn_cancel = document.createElement("input");
            tipbtn_cancel.setAttribute("class", "cancel");
            tipbtn_cancel.setAttribute("type", "button");
            tipbtn_cancel.value = cancelText;

            tipbtn.appendChild(tipbtn_sure);
            tipbtn.appendChild(tipbtn_cancel);

            divNode.appendChild(tiptop);
            divNode.appendChild(tipinfo);
            divNode.appendChild(tipbtn);
            window.document.body.appendChild(divNode);
            this.bind(tiptop_a, "click", function(){layer.close()});
            this.bind(tipbtn_sure, "click", function(){layer.close();sureFunc.call();});
            this.bind(tipbtn_cancel, "click", function(){layer.close();cancelFunc.call();});
            this.animation.fadeIn(divNode);
            var e =  window.event || arguments[0];
            var obj = e.srcElement || e.target;
            this.srcEventElement = obj;
        },
        alert: function(option){
            var opt = option || {};
            var title = opt.title || "消息";
            var content = opt.content || "如果是请点击确定按钮 ，否则请点取消。";
            var sureText = opt.sure || "确定";
            var sureFunc = opt.sureFunc || function(){};
            var divNode = window.document.createElement("div");
            divNode.setAttribute("class", "tip");
            divNode.style.display = "block";

            var tiptop = document.createElement("div");
            tiptop.setAttribute("class", "tiptop");

            var tiptop_span = document.createElement("span");
            tiptop_span.innerHTML = title;

            var tiptop_a = document.createElement("a");

            tiptop.appendChild(tiptop_span);
            tiptop.appendChild(tiptop_a);

            var tipinfo = document.createElement("div");
            tipinfo.setAttribute("class", "tipinfo clearfix");

            var tipright = document.createElement("div");
            tipright.setAttribute("class", "tipright");

            var tipright_p = document.createElement("p");
            tipright_p.innerHTML = content;

            var tipright_cite = document.createElement("cite");
            tipright_cite.innerHTML = "如果是请点击确定按钮 ，否则请点取消。";

            tipright.appendChild(tipright_p);
            tipright.appendChild(tipright_cite);

            tipinfo.appendChild(tipright);

            var tipbtn = document.createElement("div");
            tipbtn.setAttribute("class", "tipbtn");

            var tipbtn_sure = document.createElement("input");
            tipbtn_sure.setAttribute("class", "sure");
            tipbtn_sure.setAttribute("type", "button");
            tipbtn_sure.value = sureText;

            tipbtn.appendChild(tipbtn_sure);

            divNode.appendChild(tiptop);
            divNode.appendChild(tipinfo);
            divNode.appendChild(tipbtn);

            window.document.body.appendChild(divNode);
            this.bind(tiptop_a, "click", function(){layer.close()});
            this.bind(tipbtn_sure, "click", function(){sureFunc.call();layer.close();});
            this.animation.fadeIn(divNode);
            var e =  window.event || arguments[0];
            var obj = e.srcElement || e.target;
            this.srcEventElement = obj;
        },
        open: function(option){
            var opt = option || {};
            var title = opt.title || "消息";
            var content = opt.content || "如果是请点击确定按钮 ，否则请点取消。";
            var divNode = window.document.createElement("div");
            divNode.setAttribute("class", "tip");
            divNode.style.display = "block";

            var tiptop = document.createElement("div");
            tiptop.setAttribute("class", "tiptop");

            var tiptop_span = document.createElement("span");
            tiptop_span.innerHTML = title;

            var tiptop_a = document.createElement("a");

            tiptop.appendChild(tiptop_span);
            tiptop.appendChild(tiptop_a);

            var tipinfo = document.createElement("div");
            tipinfo.setAttribute("class", "tipinfo clearfix");

            var iframe = document.createElement("iframe");
            iframe.src = content;
            iframe.setAttribute("frameborder", "no");
            iframe.setAttribute("border", "0");
            iframe.setAttribute("scrolling", "no");
            iframe.style.width = "100%";

            iframe.onload = function (node) {
                var iframeNode = node.target;
                if (iframeNode) {
                    var iframeWin = iframeNode.contentWindow || iframeNode.contentDocument.parentWindow;
                    if (iframeWin.document.body) {
                        var h = iframeWin.document.documentElement.scrollHeight || iframeWin.document.body.scrollHeight;
                        iframeNode.style.height = h +"px";
                    }
                }
            };

            tipinfo.appendChild(iframe);

            divNode.appendChild(tiptop);
            divNode.appendChild(tipinfo);

            window.document.body.appendChild(divNode);
            this.bind(tiptop_a, "click", function(){layer.close()});
            this.animation.fadeIn(divNode);
            var e =  window.event || arguments[0];
            var obj = e.srcElement || e.target;
            this.srcEventElement = obj;
        },
        closeAll : function(){
            var layerArray = window.document.getElementsByClassName("tip");
            for(var i=0; i<layerArray.length; i++){
                this.animation.fadeOut(layerArray[i]);
                document.body.removeChild(layerArray[i]);
            }
        },
        close: function(){
            var layerArray = document.getElementsByClassName("tip");
            this.animation.fadeOut(layerArray[layerArray.length-1]);
            document.body.removeChild(layerArray[layerArray.length-1]);
        },
        bind: function(obj, eventType, callback, args){
            if(window.addEventListener){
                obj.addEventListener(eventType, callback, false);
            }else if(window.attachEvent){
                obj.attachEvent(eventType, callback);
            }
        },
        animation : {
            fadeIn : function(target) {
                this.fade(target, true);
            },
            fadeOut : function(target) {
                this.fade(target, false);
            },
            fade : function(target, flag) {
                var value = flag ? 0 : 1;
                target.style.opacity = value;
                target.style.filter = 'alpha(opacity=' + value + ')';

                (function() {
                    target.style.opacity = value;
                    target.style.filter = 'alpha(opacity=' + value + ')';
                    if (flag) {
                        value+=0.1;
                        if (value <= 1) {
                            setTimeout(arguments.callee, 15);// 继续调用本身
                        }
                    } else {
                        value-=0.1;
                        if (value >= 0) {
                            setTimeout(arguments.callee, 15);// 继续调用本身
                        }
                    }
                })();
            }
        }
    }
})(window);