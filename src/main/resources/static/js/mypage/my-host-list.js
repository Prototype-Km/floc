$(document).ready(function(){
    const $div = $(".css-1w92ebd div");


    let text = "";
    ploggings.forEach((plogging) => {
        text += `
            <div class="col-6 col-lg-4" style="">
                                    <div class="css-prip86 e1lm7yo60"><a class="css-beq49r e1vfbmcc3"
                                                                         href="">
           <!--<img src="/image/mypage/.png" class="image">-->
       </a>
                                    </div>
                                    <div class="css-1647809 e1e2zisd4"><h2 class="css-z2d3s1 e1e2zisd2">${plogging.ploggingTitle}</h2>
                                        <address class="project-feed__item__writer-wrap"><a
                                                class="project-feed__item__writer"
                                                href=""><img
                                                class="project-feed__item__writer__image" alt=""
                                                src="/image/mypage/location.png">
                                            <span
                                                    class="project-feed__item__writer__name">${plogging.ploggingStartLocation}</span></a>
                                        </address>
                                        <address class="project-feed__item__writer-wrap"><a
                                                class="project-feed__item__writer"
                                                href=""><img
                                                class="project-feed__item__writer__image" alt=""
                                                src="/image/mypage/base.png"><span
                                                class="project-feed__item__writer__name">${plogging.userNickname}</span></a>
                                        </address>
                                        <div class="css-iadmuc e1e2zisd3">최대 인원 ${plogging.ploggingMaximumParticipant}<span class="css-4vnul8 e1e2zisd8">조회수 ${plogging.ploggingViewedCount}</span>
                                        </div>
                                        <div class="css-iadmuc e1e2zisd3">
                                            <span class="css-4vnul9 e1e2zisd8">${elapsedTime(plogging.ploggingRegisterDate)}</span>
                                        </div>
                                    </div>
             </div>
        `
    });

    $div.html(text);
});