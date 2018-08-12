var deckobj = new deck.DeckGL({
  container: 'container',
  mapboxApiAccessToken: '',
  mapStyle: 'https://free.tilehosting.com/styles/positron/style.json?key=U0iNgiZKlYdwvgs9UPm1',
  longitude: -122.402,
  latitude: 37.79,
  zoom: 11,
  bearing: 0,
  pitch: 60,
  layers: [
    new HexagonLayer({
        id: 'hexagon-layer',
        data: demdata,
        pickable: true,
        extruded: true,
        radius: 200,
        elevationScale: 4,
        getPosition: d => d.COORDINATES,
        onHover: ({object}) => demoTooltip(object)
        /*onHover: ({object}) => setTooltip(`${object.centroid.join(', ')}\nCount: ${object.points.length}`)*/
      })
  ]
});

function demoTooltip(object){
	console.log(object);
}