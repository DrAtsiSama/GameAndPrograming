import React, { useState } from 'react';
import { SafeAreaView, StyleSheet, Text, StatusBar, View, FlatList, TouchableOpacity } from 'react-native';
import { data } from './allSpaceShip';
const Item = ({ item, onPress, style }) => (
  <TouchableOpacity onPress={onPress} style={[styles.item, style]}>
    <Text style={styles.title}>{item.name}</Text>
  </TouchableOpacity>
);
const App = () => {
  const [selectedId, setSelectedId] = useState(null);
  const renderItem = ({item}) => {
    const backgroundColor = item.id === selectedId ? "#6e3b6e" : "#f9c2ff";
    return (
      <Item
        item = {item}
        onPress={() => setSelectedId(item.id)}
        style = {{backgroundColor}}
      />
    )
  };
  return (
    <SafeAreaView style={styles.safeContainer}>
      <View style={styles.container}>
        <FlatList
            data = {data.results}
            renderItem = {renderItem}
            keyExtractor = {(item) => item.name}
            extraData = {selectedId}
        />
      </View>
    </SafeAreaView>
  );
};
const styles = StyleSheet.create({
  safeContainer: {
    flex: 1,
    marginTop: StatusBar.currentHeight || 0,
  },
  container: {
    flex: 1,
    marginTop: StatusBar.currentHeight || 0,
  },
  item: {
    padding: 20,
    marginVertical: 8,
    marginHorizontal: 16,
    borderRadius: 70
  },
  title: {
    fontSize: 32,
  },
});
export default App;
