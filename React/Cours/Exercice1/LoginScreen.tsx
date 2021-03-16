import * as React from 'react';
import { Text, View, StyleSheet } from 'react-native';
import Constants from 'expo-constants';

// or any pure javascript modules available in npm
import { Card, TextInput, Button } from 'react-native-paper';

function FormLogin(){
  const [email, setEmail] = React.useState('');
  const [password, setPassword] = React.useState('');
  return (
    <View>
      <View style={styles.formulaire}>
        <TextInput label="email" placeholder="Email" style={styles.input} onChangeText={(email:string) => setEmail(email)}/>
        <TextInput label="password" secureTextEntry="true" placeholder="password" style={styles.input} onChangeText={(password:string) => setPassword(password)}/>
        <Button icon="check" style={styles.buttonC} mode="contained" onPress={() => console.log('button press')}>
          Se connecter
        </Button>
      </View>

      <Text style={styles.condiuse}> Lire les conditions d'utilisations. </Text>
    </View>
  )
}
export default function App(){

  return (
    <View style={styles.container}>
      <View style={styles.head}>
        <Text style={styles.title}> Bienvenue sur StarPort </Text>
      </View>
      <FormLogin/>
    </View>

    
  )
}

const styles = StyleSheet.create({
  container: {
    justifyContent: 'center',
    paddingTop: Constants.statusBarHeight,
    borderColor: 'black',
    padding: 8,
    paddingLeft:10,
    paddingRight: 10,
    border: '2px solid red'
  },
  head : {
    justifyContent: 'center',
    paddingTop: Constants.statusBarHeight,
    backgroundColor: "purple",
    padding: 8,
    paddingLeft:10,
    paddingRight: 10,
    border: '2px solid red'
  },
  title: {
    margin: 24,
    fontSize: 40,
    fontWeight: "bold",
    textAlign: "center"
  },
  input : {
    marginTop: 20,
    backgroundColor: "#ccc",
    borderRadius: 7
  },
  formulaire: {
    margin:40
  },
  buttonC : {
    marginTop: 20,
    textAlign: "center",
    borderRadius:50
  },
  condiuse: {
    color: "grey",
    textAlign: "center"

  }
})
