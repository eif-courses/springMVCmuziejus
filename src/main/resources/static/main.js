function deleteItem(Id) {
    $.ajax({
        url: '/' + Id,
        type: 'DELETE',
        success: function(result) {
            var newDoc = document.open("text/html", "replace");
            newDoc.write(result);
            newDoc.close();
        }
    });
}