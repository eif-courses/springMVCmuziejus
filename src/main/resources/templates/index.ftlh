<#include "header.ftlh">
<script type="text/javascript">

</script>

<#if message??>
    <div class="alert alert-danger" role="alert">
        ${message}
    </div>
</#if>
<div class="row row-cols-1 row-cols-md-3">
    <#list gadgets as item>
        <div class="col mb-4">
            <div class="card">
                <model-viewer poster="${item.imageURL}" style="height: 200px" class="card-img-top" src="${item.model3dURL}" alt="A 3D model of an astronaut" auto-rotate camera-controls reveal="interaction"></model-viewer>
                <div class="card-body">
                    <h5 class="card-title">${item.title}</h5>
                    <p class="card-text">${item.description}</p>
                    <audio controls>
                        <source src="${item.soundURL}" type="audio/wav">
                        Your browser does not support the audio element.
                    </audio>
                </div>

                <a href="/delete/${item.id}">DELETE</a>

            </div>
        </div>

    </#list>
</div>


<#include "footer.ftlh">


