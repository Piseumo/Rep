import { StatusBar } from "expo-status-bar";
import { Text, View, TouchableOpacity, TextInput, Alert } from "react-native";

export default function App() {

const doSignUp = () =>{
  Alert.alert("Sign up","회원가입이 완료 되었습니다.");
}

  return (
    <View className='flex-1 justify-center items-center bg-white'>
      <StatusBar style='auto' />
      <Text className='text-center mt-3 text-2xl font-light text-orange-300'>
        WelcomeToMyApp
      </Text>
      {/* Additional components goes here */}
      <View className='mt-5 mx-5'>
        <View>
          <Text className='text-gray-400'>EMAIL:</Text>
          <TextInput
            placeholder='Enter Email...'
            className='border border-dotted p-2 text-gray-500 border-amber-400 mt-1'
          />
        </View>
        <View className='mt-3'>
          <Text className='text-gray-400'>PASSWORD:</Text>
          <TextInput
            secureTextEntry
            placeholder='Enter Password...'
            className='border text-gray-500 border-dotted p-2 border-amber-400 mt-1'
          />
        </View>

        <View className='bg-slate-500 text base'>
        <TouchableOpacity onPress={doSignUp}>
            <Text className='text-white mx-2 text-sm'>
            SignUp
            </Text>
        </TouchableOpacity>
        </View>


        <TouchableOpacity className='bg-orange-300 p-3 mt-4'>
          <Text className='text-center text-base text-white'>Login</Text>
        </TouchableOpacity>

        <Text className='text-center font-normal text-gray-500 text-base mt-3'>
          OR
        </Text>
        <View className='mt-4'>
          <TouchableOpacity className='flex flex-row items-center justify-center p-2 bg-orange-300'>
            <Text className='text-white mx-2 text-sm'>Sign In With Google</Text>
          </TouchableOpacity>
        </View>
        <View className='mt-6 flex-row justify-center'>
          <Text className=''>New to FreeCodeCamp? </Text>
          <TouchableOpacity>
            <Text className='text-amber-500'>Create an Account</Text>
          </TouchableOpacity>
        </View>
      </View>
    </View>
  );
}