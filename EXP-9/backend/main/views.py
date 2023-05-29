from django.shortcuts import render
from rest_framework.views import APIView  
from rest_framework.response import Response
import requests


class HomeView(APIView):
    def get(self, request, format=None):
        code = requests.get('http://172.17.0.1:8001/code/').json()['code']
        return Response({'message': f'Your code is {code} and it is valid for 10 seconds'})