function addItemToCart(){
    
    //We obtain the item to be added
    let newItem = document.getElementById("newShoppingItem").value; //With .value I can make sure that it is the value within the input, and not the input itself.

    //We make sure there's a valid input for an item to be added
    if (newItem === ""){
        alert ("You need to enter a value!")
        return;
    }else{
        console.log("Item added!")
    }

    //This creates the element into the list (IT'S NOT ON THE LIST YET!)
    let itemAdded = document.createElement("li"); //It's "li" because we are adding a 'list' item
    itemAdded.textContent = newItem + "  "; //textContent assigns/obtains a text value from an element

    //!!!!Creating a REMOVE button to take off an item from the Shopping List
    let deleteButton = document.createElement("button");
    deleteButton.textContent = "Delete item";
    deleteButton.onclick = function () {
        itemAdded.remove()
    }

    //We link the itemAdded (parent) with the deleteButton (child)
    itemAdded.appendChild(deleteButton);

    //We add the element to the list
    document.getElementById("currentShoppingList").appendChild(itemAdded);

    //We'll clean the info on the input box
    document.getElementById("newShoppingItem").value = "";
}

function deleteAllItems(){

}