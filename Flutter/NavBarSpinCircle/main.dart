import 'package:flutter/material.dart';
import 'package:spincircle_bottom_bar/modals.dart';
import 'package:spincircle_bottom_bar/spincircle_bottom_bar.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Flutter Spin Circle',
      theme: ThemeData(
        primarySwatch: Colors.blue,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      home: MyHomePage(title: 'Flutter Spin Circle'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  MyHomePage({Key key, this.title}) : super(key: key);

  final String title;

  @override
  _MyHomePageState createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.deepOrangeAccent,
        title: Text(widget.title),
      ),
      body: SpinCircleBottomBarHolder(
        bottomNavigationBar: SCBottomBarDetails(
          iconTheme: IconThemeData(color: Colors.black45),
          activeIconTheme: IconThemeData(color:  Colors.orange),
          titleStyle: TextStyle(color: Colors.black45, fontSize: 12),
          activeTitleStyle: TextStyle(color: Colors.orange, fontSize: 12, fontWeight: FontWeight.bold),
          circleColors: [
            Colors.white,
            Colors.orange,
            Colors.redAccent
          ],
          actionButtonDetails: SCActionButtonDetails(
            color: Colors.redAccent,
            icon: Icon(Icons.expand_less),
            elevation: 0,
          ),
          backgroundColor: Colors.white,
          bnbHeight: 80,
            items: <SCBottomBarItem>[
          SCBottomBarItem(icon: Icons.verified_user, onPressed: (){}, title: "Utilisateur"), //instance 4, 6, 8 items ~
          SCBottomBarItem(icon: Icons.supervised_user_circle, onPressed: (){},title: "Details" ),
          SCBottomBarItem(icon: Icons.notifications, onPressed: (){},title: "Notifs" ),
          SCBottomBarItem(icon: Icons.details, onPressed: (){}, title: "Nouveau"), // icon data
        ], circleItems: <SCItem>[
          SCItem(icon: Icon(Icons.add), onPressed: (){}),
          SCItem(icon: Icon(Icons.print), onPressed: (){}),
          SCItem(icon: Icon(Icons.map), onPressed: (){}), // icon widget
        ]),
        child: Container(
          color: Colors.grey.withAlpha(100),
          child: Center(child: Text("DarekaSama"),),
        ),
      ),// This trailing comma makes auto-formatting nicer for build methods.
    );
  }
}
