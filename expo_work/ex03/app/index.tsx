import { Link } from "expo-router";
import { View } from "react-native";
import { Text } from "react-native";

export default function Index(){
    return (
        <View style={{marginTop:50}}>
          <Text style={{fontSize:50}}>Index</Text>
          <Link href="/home">
          <Text style={{fontSize:50}}>HOME</Text>
          </Link>
          <Link href="/home/aa">
          <Text style={{fontSize:50}}>AA</Text>
          </Link>
          <Link href="(tabs)">
          <Text style={{fontSize:50}}>TABS</Text>
          </Link>
        </View>
    );
}