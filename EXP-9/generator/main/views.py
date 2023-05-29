from django.shortcuts import render
from rest_framework.views import APIView  
from rest_framework.response import Response
import random


class HomeView(APIView):
    def get(self, request, format=None):
        code = random.randint(100000, 999999)
        return Response({'code': code})